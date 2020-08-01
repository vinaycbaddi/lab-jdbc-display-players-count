package model;

public class Skill{
	private long skillld;
	private String skillName;
	private int skillcount;
	public int getSkillcount() {
		return skillcount;
	}
	public void setSkillcount(int skillcount) {
		this.skillcount = skillcount;
	}
	public long getSkillld() {
		return skillld;
	}
	public void setSkillld(long skillld) {
		this.skillld = skillld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Skill(long skillld, String skillName) {
		super();
		this.skillld = skillld;
		this.skillName = skillName;
	}
	public Skill(long skillld, String skillName, int skillcount) {
		super();
		this.skillld = skillld;
		this.skillName = skillName;
		this.skillcount = skillcount;
	}
	
}
