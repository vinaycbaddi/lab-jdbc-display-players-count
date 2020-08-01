package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public TreeMap<Integer,Skill> skillCount() throws IOException, SQLException{
		Connection con = ConnectionManager.getConnection();
		TreeMap<Integer, Skill>map = new TreeMap<Integer,Skill>();
		String sql="select * from player";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		int batting =0;
		int bowling =0;
		int allrounder = 0;
		int w_k_b = 0;
		while(rs.next()) {
			if(rs.getLong(4)==1) {
				allrounder++;
			}
			else if(rs.getLong(4)==2) {
				batting++;
				}
			else if(rs.getLong(4)==3) {
				bowling++;
			}
			else if(rs.getLong(4)==4) {
				w_k_b++;
			}
		}

		Skill s1=new Skill((long)1,"allrounder",allrounder);
		Skill s2=new Skill((long)2,"batting",batting);
		Skill s3=new Skill((long)3,"bowling",bowling);
		Skill s4=new Skill((long)4,"w_k_b",w_k_b);
		
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		map.put(4,s4);
		
		con.close();	
		return map;
	}
}















