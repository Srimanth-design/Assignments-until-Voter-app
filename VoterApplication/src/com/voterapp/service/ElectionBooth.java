package com.voterapp.service;

import java.util.Arrays;

import com.voterapp.exception.LocalityMismatchException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBooth {

	String localities[] = new String[] { "RTC Crossroads", "NTR Gardens", "KPHB Colony", "JNTU Center" };

	public boolean checkAge(int age) throws UnderAgeException {
		// TODO Auto-generated method stub

		try {
			if (age >= 18) {
				return true;
			} else {
				throw new UnderAgeException("Under age -- Not Eligible");
			}
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean checkLocality(String locality) throws LocalityMismatchException {
		// TODO Auto-generated method stub

		try {
			for (int i = 0; i <= localities.length; i++) {
				if (Arrays.asList(localities).contains(locality)) {
					return true;
				} else if (!Arrays.asList(localities).contains(locality)) {
					throw new LocalityMismatchException("Location Mismatch -- Not Eligible");
				}
			}
		} catch (LocalityMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return false;

	}

	boolean checkVoterId(int VoterId) throws NoVoterIdException {
		// TODO Auto-generated method stub

		try {
			if (1000 <= VoterId && VoterId <= 9000) {
				return true;
			}
			else {
				throw new NoVoterIdException("Incorrect ID -- Not Eligible");
			}
		} catch (NoVoterIdException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
	}

	public void CheckEligibility(int age, String locality, int voterId) throws NotEligibleException {

		if(checkAge(age)&&
		checkLocality(locality)&&
		checkVoterId(voterId)) {
			System.out.println("Vote registered");
		}
		else {
			throw new NotEligibleException("Vote not possible");
		}
		
	}

}
