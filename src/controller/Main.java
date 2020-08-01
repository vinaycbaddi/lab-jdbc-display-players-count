package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

class Main{
	public static void main(String args[]) throws IOException, SQLException {
		SkillDAO skilldao = new SkillDAO();
		
		TreeMap<Integer,Skill> map = new TreeMap<Integer,Skill>();
		map=skilldao.skillCount();
		System.out.println("Players"+" "+"Skill");
		
		for(Map.Entry<Integer,Skill> e: map.entrySet())
		{
			int  count=e.getKey();
			Skill skill=e.getValue();
			System.out.print(count+")"+"Skill Count: "+skill.getSkillcount()+", "+"Skill Name: "+skill.getSkillName());
			System.out.println("");
			
		}
	}
}
