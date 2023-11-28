package com.kodnest.banking;

class BotFactory {
	public static void main(String[] args) {
		TrainerBot trainerBot = new TrainerBot();
		trainerBot.reading();
		trainerBot.writing();
		trainerBot.walking();
		trainerBot.teaching();
		
		System.out.println();
		
		StudentBot studentBot = new StudentBot();
		studentBot.reading();
		studentBot.writing();
		studentBot.walking();
		studentBot.applyingSkills();
		
		System.out.println();
		
		DoctorBot doctorBot = new DoctorBot();
		doctorBot.reading();
		doctorBot.writing();
		doctorBot.walking();
		doctorBot.operating();
	}
}
