package com.voterapp.main;

import com.voterapp.exception.LocalityNotFoundException;
import java.util.Scanner;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBooth;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.exception.InValidVoterException;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		System.out.println("enter location");
		String location=sc.next();
		System.out.println("enter voterid");
		int vid=sc.nextInt();
		
		
		ElectionBooth electionBooth = new ElectionBoothImpl();
        try {
            boolean eligible = electionBooth.checkEligibility(age,location,vid);
            if (eligible) {
                System.out.println("Voter is eligible.");
            }
        } catch (UnderAgeException e) {
        	System.out.println(e);
            System.out.println("Voter is underage: " + e.getMessage());
        } catch (LocalityNotFoundException e) {
        	System.out.println(e);
            System.out.println("Locality not found: " + e.getMessage());
        } catch (NoVoterIDException e) {
        	System.out.println(e);
            System.out.println("Invalid voter ID: " + e.getMessage());
        } catch (InValidVoterException e) {
        	System.out.println(e);
            System.out.println("Invalid voter: " + e.getMessage());
        }

	}

}
