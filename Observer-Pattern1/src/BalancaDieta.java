class BalancaDieta implements Observer {
      
       public void update(double novoPeso) {
        if (peso >= 100) {
            System.out.println("Voc� ultrapassou o peso limite no sistema!");
        }
       }
}


