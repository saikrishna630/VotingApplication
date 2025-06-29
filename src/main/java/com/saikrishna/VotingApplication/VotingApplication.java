package com.saikrishna.VotingApplication;

import com.saikrishna.VotingApplication.counter.SimpleAuthorityCounter;
import com.saikrishna.VotingApplication.party.PoliticalParty;
import com.saikrishna.VotingApplication.user.User;
import com.saikrishna.VotingApplication.userList.UserList;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import java.util.Scanner;

//@SpringBootApplication
public class VotingApplication {

	public static void main(String[] args) {
		//SpringApplication.run(VotingApplication.class, args);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.saikrishna.VotingApplication");
		System.out.println("Welcome User");
		Scanner sc=new Scanner(System.in);

		while(true){
			System.out.println("Choose from below");
			System.out.println("1. Wanna Vote  2. See All Votes(ADMIN) 3.Exit");
			int userInput=sc.nextInt();
			sc.nextLine();
			String beanId="";
			switch (userInput){
				case 1:{
					System.out.println("Enter your username");
					String userName=sc.nextLine();
					User user=(User)context.getBean("user");
					user.setUserName(userName);

					System.out.println("Choose the party you want to vote");
					System.out.println("1. Democratic Party  2.Republic Party  3.Independent Party");
					int userPartySelect=sc.nextInt();
					sc.nextLine();
					if(userPartySelect==1){
						beanId="democratic";
					}else if(userPartySelect==2){
						beanId="republic";
					}else if(userPartySelect==3){
						beanId="independent";
					}else{
						System.out.println("Choose valid input");
						break;
					}
					PoliticalParty politicalParty=(PoliticalParty) context.getBean(beanId);
					user.setPoliticalParty(politicalParty);
					UserList userList=(UserList) context.getBean("userList");
					userList.addUser(user);
					SimpleAuthorityCounter simpleAuthorityCounter=(SimpleAuthorityCounter) context.getBean("authorityCounter");
					simpleAuthorityCounter.setUserList(userList);
					break;
				}
				case 2:{
					SimpleAuthorityCounter simpleAuthorityCounter=(SimpleAuthorityCounter) context.getBean("authorityCounter");
					List<User> userList= simpleAuthorityCounter.getUserList().getUsersList();
					for(User i:userList){
						System.out.println(i.getUserName()+" "+i.getPoliticalParty().getPartyName());
					}
					System.out.println("Thank you");
					System.exit(0);
					break;
				}
				case 3:{
					context.close();
					break;
				}
				default:{
					System.out.println("Choose Valid Input");
				}
			}

		}

	}

}
