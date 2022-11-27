package HW7;

import java.util.ArrayList;
import java.util.List;

public class GendersTeam implements Team{
	private String name;
	private int athletnum;
	private int medalnum;
	
	private List<Team>subTeams;
	
	public GendersTeam(String name, int athletnum, int medalnum) {
		this.name = name;
		this.athletnum = athletnum;
		this.medalnum = medalnum;
		this.subTeams = new ArrayList<Team>();
	}
	public void addTeam(Team t) {
		subTeams.add(t);
	}
	@Override
	public void printTeamName() {
		System.out.println(name);
		subTeams.forEach(Team::printTeamName);
	}
	@Override
	public void printTeamAthletnum() {
		System.out.println(name);
		subTeams.forEach(Team::printTeamAthletnum);
	}
	@Override
	public void printTeamMedalnum() {
		System.out.println(name);
		subTeams.forEach(Team::printTeamMedalnum);
	}
}
