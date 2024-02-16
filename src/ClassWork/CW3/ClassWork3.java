package ClassWork.CW3;

public class ClassWork3{
	public static void Execute() {
		// task 1
	    Car[] cars = new Car[5];
		
		for(int i = 0; i < cars.length; i++){
			cars[i] = new Car("Mazda", "MX" + (i+1), 240 + i * 10, i);
			
			cars[i].ride();
		}
		
		// task 2
		
		Car[] cars1 = new Car[10];
		
		for(int i = 0; i < cars1.length; i++){
			cars1[i] = new Car("Mazda", "MX" + (i+1), 240 + i * 10, i);
		}
		
		Car maximalochka = cars1[0];
		
		for(Car car: cars1)
			if(car.maxSpeed > maximalochka.maxSpeed)
				maximalochka = car;
		
		System.out.println(maximalochka.toString());
		
		// task 3
		
		Player[] players = new Player[7];
		
		for(int i = 0; i < players.length; i++){
			String name = "a"+i;
			String position = "FWD";
			players[i] = new Player(name, position, i+1, i%3==0 );
		}
		
		Club club = new Club("CyberBoba", players);
		
		club.printClubData();
		
		club.printSquad();
	}
}

class Car{
	public String name;
	public String model;
	public int maxSpeed;
	public double engineVolume;
	
	public Car(){
		
	}
	
	public Car( String name,
				String model,
				int maxSpeed,
				double engineVolume){
		this.name = name;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.engineVolume = engineVolume;
	}

	public void ride(){
		if(engineVolume <= 2.2d){ 
			System.out.println("Couldn't start engine");
			return;
		}
		
		System.out.println("Car is riding");
	}
	
	@Override
	public String toString(){
		return "Car: " + name + " " + model + ", " + maxSpeed + "km/h, " + engineVolume + " liters";
	}

}

class Player{
	public String name;
	public String position;
	public int number;
	public boolean isInjured;
	
	public Player(){}
	
	public Player( String name,
					String position,
					int number,
					boolean isInjured){
		this.name= name;
		this.position = position;
		this.number = number;
		this.isInjured = isInjured;
	}
	
	public String getPlayerData(){
		return number + " | " + name + " | " + position + " | " + isInjured;
	}
}

class Club{
	public String name;
	public Player[] players;
	
	public Club(){}
	
	public Club(String name, Player[] players){
		this.name = name;
		this.players = players;
	}
	
	public void printClubData(){
		String info = "";
		
		info += name + "\n";
		
		for(int i = 0; i < players.length; i++){
			info += players[i].getPlayerData() + "\n";
		}
		
		System.out.println(info);
	}
	
	public void printSquad(){
		for(Player player : players){
			if(player.isInjured) continue;
			
			System.out.println(player.number + " " + player.name + " " + player.position);
		}
	}
}