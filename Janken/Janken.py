"""Janken Game

CS101 project for codecademy:

Janken!

Here's what we're gonna do:

First we're gonna prompt the user to input either (R)ock, (P)aper or (S)cissors
The program/CPU opponent will play their hand as well
If the user wins, opponent will ask for a rematch(Potentially we can up this to 2 of 3, then 3 out of 5, etc.)
If the user loses, opponent will ask if they want to go again(potentially we can up this to 2 out of 3, etc.)
If the user ties, "Aikou deshou!" and CPU will go back to ask for (R)ock, (P)aper or (S)cissors

We'll do this utilizing my jp knowledge and RPS knowledge, I don't think we'll need a class per se this is just gonna be a text script that runs until the user gets bored/tired or wins. 

Quick and easy, let's get it done.

"""
#Random import to randomize the CPU's play vs the User's play, we'll use this to generate a random number between 1 and 3, then assign each number to either R, P or S.
import random
#We'll keep track of the matches and wins for the user, with this we'll up the ante depending on how many mathces they win and how many matches they play, we can do 2 out of 3, then 3 out of 5, etc.
match_count = 0
total_wins = 0
total_losses = 0

#This is the main function that will run the game, it will prompt the user for their play, generate a random play for the CPU, and then determine the winner.
def janken():
    global match_count, total_wins, total_losses
    user_play = input("Please enter your play (R)ock, (P)aper, or (S)cissors: ").upper()[0]
    if user_play not in ["R", "P", "S"]:
        input("Warning: Invalid input, please enter (R)ock, (P)aper or (S)cissors: ").upper()[0]
        janken()
    cpu_play = random.randint(1, 3)
    if cpu_play == 1:
        cpu_play = "Rock"
    elif cpu_play == 2:
        cpu_play = "Paper"
    else:
        cpu_play = "Scissors"
    print(f"CPU played: {cpu_play}")
    match_count+=1
    if user_play == cpu_play:
        print("Aikou deshou! It's a tie! Let's go again!")
        janken()
    elif user_play == "R" and cpu_play[0] == "S":
        print("You win! Rock beats Scissors!")
        total_wins += 1
        rematch()
    elif user_play == "P" and cpu_play[0] == "R":
        print("You win! Paper beats Rock!")
        total_wins += 1
        rematch()
    elif user_play == "S" and cpu_play[0] == "P":
        print("You win! Scissors beats Paper!")
        total_wins += 1
        rematch()
    else:
        print("You lose! Better luck next time!")
        total_losses += 1
        rematch()

def match_counter():
    [print(f"Total matches played: {match_count}"), print(f"Total wins: {total_wins}"),
    print(f"Total losses: {total_losses}")]

def rematch():
    one_more = input("Do you want to play a rematch? (Y/N): ").upper()[0]
    if one_more == "Y":
        print(f"You got lucky last time, let's go again!")
        janken()
    elif one_more == "N":
        print("Thanks for playing! See you next time!")
        print("Final results: ")
        match_counter()
    else: 
        print("Warning: Invalid input, please enter Y or N.")
        rematch()

if __name__ == "__main__":
    print("Hello! Welcome to Janken, the Japanese version of Rock, Paper, Scissors! Let's get started!")
    print("In case you don't know, here are the rules of Janken:")
    print("Rock beats Scissors, Scissors beats Paper, and Paper beats Rock! If you and the CPU play the same hand, it's a tie and you go again!")
    janken()