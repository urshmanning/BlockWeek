import java.util.*;
import javax.swing.*;

public class Team 
{
	private static int[] Team1 = {0,0,0,0,0};
	private static int[] Team2 = {0,0,0,0,0};
	private static int[] Team3 = {0,0,0,0,0};
	private static int[] Team4 = {0,0,0,0,0};

	private static ArrayList<Integer> Games = new ArrayList<Integer>();
	private static ArrayList<Integer> Temp = new ArrayList<Integer>();
	
	private static Team t = new Team();
	
	private static int home = 0;
	private static int away = 0;
	
	public static void main(String[] args)
	{
		
		int temp = 0;
		int count = 0;
		int pos = 0;
				
		while(count<=3)
		{
			temp = Integer.parseInt(JOptionPane.showInputDialog("Enter the temperature"));
			
			if(temp<10)
			{
				//too cold to play, recall temp
				count++;
			}
			else
			{
				//warm enough to play, reset count
				count=0;
				
				Temp.set(pos, temp);
				pos++;
			}
			
		}
		
		//call methods
		//create game
		t.makeGame(temp, pos);
		
		
		//t.updateTeam(home, away);
		
	}
	
	public void makeGame(double t, int p)
	{		
		int team1=0;
		int team2=0;
		
		int id = 0;
		
		for(int i = 0; i>=(p*6); i=i+6)
		{
			int score1 = (int)(Math.random()*10);
			int score2 = (int)(Math.random()*10);
			
			while(team1==team2)
			{
				team1 = (int)(Math.random()*4)+1;
				team2 = (int)(Math.random()*4)+1;
			}
			
			//fills id
			Games.set(i, id+1);
			//fills temp
			Games.set(i+1, Temp.get(id));
			//fills home team
			Games.set(i+2, team1);
			//home score
			Games.set(i+3, score1);
			//away team
			Games.set(i+4, team2);
			//away score
			Games.set(i+5, score2);
			
			//update home team
			if(team1==1)
			{
				if(score1>score2)
				{
					//increase win
					Team1[0] = Team1[0]+1;
				}
				else if(score2>score1)
				{
					//increase loss
					Team1[1] = Team1[1]+1;
				}
				else
				{
					//increase tie
					Team1[2] = Team1[2]+1;
				}
				
				//goals scored
				Team1[3] = Team3[3]+score1;
				
				//goals allowed
				Team1[4] = Team1[4]+score2;
				
			}
			else if(team1==2)
			{
				if(score1>score2)
				{
					//increase win
					Team2[0] = Team2[0]+1;
				}
				else if(score2>score1)
				{
					//increase loss
					Team2[1] = Team2[1]+1;
				}
				else
				{
					//increase tie
					Team2[2] = Team2[2]+1;
				}
				
				//goals scored
				Team2[3] = Team2[3]+score1;
				
				//goals allowed
				Team2[4] = Team2[4]+score2;
			}
			else if(team1==3)
			{
				if(score1>score2)
				{
					//increase win
					Team3[0] = Team3[0]+1;
				}
				else if(score2>score1)
				{
					//increase loss
					Team3[1] = Team3[1]+1;
				}
				else
				{
					//increase tie
					Team3[2] = Team3[2]+1;
				}
				
				//goals scored
				Team3[3] = Team3[3]+score1;
				
				//goals allowed
				Team3[4] = Team3[4]+score2;
			}
			else
			{
				if(score1>score2)
				{
					//increase win
					Team4[0] = Team4[0]+1;
				}
				else if(score2>score1)
				{
					//increase loss
					Team4[1] = Team4[1]+1;
				}
				else
				{
					//increase tie
					Team4[2] = Team4[2]+1;
				}
				
				//goals scored
				Team4[3] = Team4[3]+score1;
				
				//goals allowed
				Team4[4] = Team4[4]+score2;
			}
			
			
			//update away team
			if(team2==1)
			{
				if(score2>score1)
				{
					//increase win
					Team1[0] = Team1[0]+1;
				}
				else if(score1>score2)
				{
					//increase loss
					Team1[1] = Team1[1]+1;
				}
				else
				{
					//increase tie
					Team1[2] = Team1[2]+1;
				}
				
				//goals scored
				Team1[3] = Team3[3]+score2;
				
				//goals allowed
				Team1[4] = Team1[4]+score1;
			}
			else if(team2==2)
			{
				if(score2>score1)
				{
					//increase win
					Team2[0] = Team2[0]+1;
				}
				else if(score1>score2)
				{
					//increase loss
					Team2[1] = Team2[1]+1;
				}
				else
				{
					//increase tie
					Team2[2] = Team2[2]+1;
				}
				
				//goals scored
				Team2[3] = Team2[3]+score2;
				
				//goals allowed
				Team2[4] = Team2[4]+score1;
			}
			else if(team2==3)
			{
				if(score2>score2)
				{
					//increase win
					Team3[0] = Team3[0]+1;
				}
				else if(score1>score2)
				{
					//increase loss
					Team3[1] = Team3[1]+1;
				}
				else
				{
					//increase tie
					Team3[2] = Team3[2]+1;
				}
				
				//goals scored
				Team3[3] = Team3[3]+score2;
				
				//goals allowed
				Team3[4] = Team3[4]+score1;
			}
			else
			{
				if(score2>score1)
				{
					//increase win
					Team4[0] = Team4[0]+1;
				}
				else if(score1>score2)
				{
					//increase loss
					Team4[1] = Team4[1]+1;
				}
				else
				{
					//increase tie
					Team4[2] = Team4[2]+1;
				}
				
				//goals scored
				Team4[3] = Team4[3]+score2;
				
				//goals allowed
				Team4[4] = Team4[4]+score1;
			}
			
			id = id++;
		}
	}
	
	
	
	public void display()
	{
		//display teams
		//name
		//win: loss: tie:
		//scored: allowed:
		
		//display games
		//Game #1
		//temp:
		//away team: team1, goals
		//home team: team2, goals
	}
	
}
