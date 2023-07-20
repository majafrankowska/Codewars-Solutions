public class Welcome {
    public static String greet(String language) {
        if (language.equals("english")) {
            return "Welcome";
        } else if (language.equals("czech")) {
            return "Vitejte";
        } else if (language.equals("danish")) {
            return "Velkomst";
        } else if (language.equals("dutch")) {
            return "Welkom";
        } else if (language.equals("estonian")) {
            return "Tere tulemast";
        } else if (language.equals("finnish")) {
            return "Tervetuloa";
        } else if (language.equals("flemish")) {
            return "Welgekomen";
        } else if (language.equals("french")) {
            return "Bienvenue";
        } else if (language.equals("german")) {
            return "Willkommen";
        } else if (language.equals("irish")) {
            return "Failte";
        } else if (language.equals("italian")) {
            return "Benvenuto";
        } else if (language.equals("latvian")) {
            return "Gaidits";
        } else if (language.equals("lithuanian")) {
            return "Laukiamas";
        } else if (language.equals("polish")) {
            return "Witamy";
        } else if (language.equals("spanish")) {
            return "Bienvenido";
        } else if (language.equals("swedish")) {
            return "Valkommen";
        } else if (language.equals("welsh")) {
            return "Croeso";
        } else {
            return "Welcome"; 
        }
    }
}
