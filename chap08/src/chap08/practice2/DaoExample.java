package chap08.practice2;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new MySqlDao());
		System.out.println();
		dbWork(new OracleDao());
	}

}
