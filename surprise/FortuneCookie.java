package surprise;

import main.IRandom;

public class FortuneCookie implements ISurprise, IRandom {

	private String message;
	private static String[] quotes = {"Soarele nu stie cine e corect. Soarele nu stie cine e gresit."
			+ " Soarele lumineaza fara scopul de a incalzi pe cineva anume. Cel ce s-a gasit pe sine insusi e asemenea unui soare.",
			"Cine doreste cu adevarat sa se ridice sus, va inventa scara.", "Sotul si sotia trebuie sa fie asemenea mainii si ochilor: cand mana doare,\n ochii plang, iar cand ochii plang, mana sterge lacrimile.", 
			"Fara oameni simpli, nu exista oameni mari.", "Necazul, ca si rochia rupta, trebuie lasat acasa.", "Mai bine e sa fii dusmanul unui om bun, decat prietenul unui om rau.", 
			"Chiar daca niciodata nu vei avea nevoie de sabie, trebuie s-o porti toata viata.", "Daca problema poate fi rezolvata, nu merita sa-ti faci griji pentru ea. Daca insa nu poate fi rezolvata, e inutil sa-ti faci griji de ea.", 
			"Cand exista dragostea, si veziculele variolei sunt la fel de frumoase ca gropitele din obrajori.", "Victoria ii revine celui care va rabda cu jumatate de ora mai mult decat rivalul sau.", 
			"Se intampla uneori ca frunza se ineaca, iar piatra pluteste.", "Onestitatea excesiva se invecineaza cu prostia.", "Sa intrebi e o rusine pentru un minut, sa nu stii e o rusine pentru o viata.", 
			"Daca ai cazut de sapte ori, ridica-te de opt.", "Trebuie sa te feresti de trei rele: de sarpe, de omul care vorbeste frumos si de femeia capricioasa.", "Dupa ce ai gandit – hotaraste-te, dupa ce te-ai hotarat – nu te mai gandi.", 
			"Micul tunel al furnicii va surpa marele zagaz.", "Cu samuraii lupti ca samuraii, cu talharii lupti ca talharii.", "Cand omul pierde tot, ii ramane invatatura.", 
			"Ai nevoie de o dovada ca exista Dumnezeu? Oare aprinde cineva o torta ca sa vada soarele?"};

	public FortuneCookie(String message) {
		this.message = message;
	}

	@Override
	public void enjoy() {
		System.out.println(this.message);
	}

	public static FortuneCookie generate() {
		return new FortuneCookie(quotes[random.nextInt(20)]);
	}

}
