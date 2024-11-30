package rbi;


	public  abstract class  Concrete implements databaseconnection{

		public  void connect() {
			System.out.println("connect");
		}

		public void disconnect() {
			
			System.out.println("disconnect");  
		}

		public void excuteUpdate() {
			System.out.println("update");
		}


}
