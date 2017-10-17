class SpaceAge {
        double seconds;

    SpaceAge(double seconds) {
            this.seconds = seconds;

    }

    double getSeconds() {
            return seconds;
    }

    double onEarth() {
            return seconds /60 / 60 / 24 / 365.25;
    }

    double onMercury() {return formula(0.2408467);}

    double onVenus() {return formula(0.61519726 );}

    double onMars() {return formula(1.8808158 );}

    double onJupiter() {return formula(11.862615);}

    double onSaturn() {return formula(29.447498);}

    double onUranus() {return formula(84.016846 );}

    double onNeptune() {return formula(164.79132);}

    double formula(double earthYears) {

            double dayInYear = ((365.25 / 100 ) *  earthYears ) * 100;
            double day = seconds / 60 / 60 / 24 ;
            return day / dayInYear;

    }

}
