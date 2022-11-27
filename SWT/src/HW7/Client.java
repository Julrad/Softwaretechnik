package HW7;

public class Client {
	public static void main(String args[]) {
		Team OlympicsTeam2024 = new OlympicsTeam("OlympicsTeam2024", 100, 50);
		
		Team Asia = new ContinentsTeam("Asia", 30, 10);
		Team China = new CountriesTeam("China", 20, 8);
		Team WomenCHN = new GendersTeam("WomenCHN", 15, 6);
		Team Teakwondo = new SportsTeam("Teakwondo", 4, 1);
		Team Waterpolo = new SportsTeam("Waterpolo", 4, 2);
		Team ArtisticGymnastics = new SportsTeam("ArtisticGymnastics", 7, 3);
		Team MenCHN = new GendersTeam("MenCHN", 5, 2);
		Team Shooting = new SportsTeam("Shooting", 5, 2);
		
		Team Europe = new ContinentsTeam("Europe", 60, 50);
		Team Germany = new CountriesTeam("Germany", 30, 25);
		Team WomenGER = new GendersTeam("WomenGER", 15, 10);
		Team Cycling = new SportsTeam("Cycling", 10, 8);
		Team Tennis = new SportsTeam("Tennis", 5, 2);
		Team MenGER = new GendersTeam("MenGER", 15, 15);
		Team TableTennis = new SportsTeam("TableTennis", 5, 10);
		Team Football = new SportsTeam("Football", 10, 5);
		Team Italy = new CountriesTeam("Italy", 30, 25);
		Team WomenIT = new GendersTeam("WomenIT", 15, 10);
		Team Alpineski = new SportsTeam("Alpineski", 10, 5);
		Team MenIT = new GendersTeam("MenIT", 15, 15);
		Team Swimming= new SportsTeam("Swimming", 10, 5);
		
		
		
		
		OlympicsTeam2024.addTeam(Asia);
		Asia.addTeam(China);
		China.addTeam(WomenCHN);
		WomenCHN.addTeam(Teakwondo);
		WomenCHN.addTeam(Waterpolo);
		WomenCHN.addTeam(ArtisticGymnastics);
		China.addTeam(MenCHN);
		MenCHN.addTeam(Shooting);
		
		OlympicsTeam2024.addTeam(Europe);
		Europe.addTeam(Germany);
		Germany.addTeam(WomenGER);
		WomenGER.addTeam(Cycling);
		WomenGER.addTeam(Tennis);
		Germany.addTeam(MenGER);
		MenGER.addTeam(TableTennis);
		MenGER.addTeam(Football);
		Europe.addTeam(Italy);
		Italy.addTeam(WomenIT);
		WomenIT.addTeam(Alpineski);
		Italy.addTeam(MenIT);
		MenIT.addTeam(Swimming);
		
		//4a
		MenGER.printTeamAthletnum();
		//4b
		Germany.printTeamMedalnum();
		//4c
		Asia.printTeamMedalnum();
		//4d
		OlympicsTeam2024.printTeamAthletnum();
	}
}
