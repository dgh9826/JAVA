package dbTest.model;

	import java.sql.Date;
	 
	// 보통 vo 클래스 파일의 이름을 DB의 이름과 같게한다.
	 
	// vo(value object) == entity == record == row
	// do(domain object) == dto(data transfer object)
	// DB 테이블의 한 행의 정보가 기록되는 저장용 객체
	 
	// 1. 반드시 캡슐화가 적용되어야 한다 : 모든 필드는 private가 된다.
	// 2. 기본 생성자와 매개변수 있는 생성자를 작성해야 한다. (매개변수가 있는 생성자가 있다면 기본 생성자를 jvm에서 생성해주지 않기 때문)
	// 3. 모든 필드에 대해 getter와 setter 작성해야 한다.
	// 4. 직렬화 처리를 해야 한다.
	// optional. toString() 오버라이딩 <- 필드값을 확인하기 위해
	 
	public class Employee implements java.io.Serializable{
	    private int eNo;
	    private String eName;
	    private String job;
	    private int manager;
	    private Date hireDate;
	    private int salary;
	    private int commission;
	    private int dNo;
	     
	    public Employee() {
	         
	    }
	     
	    public Employee(int empNo, String empName, String job, int mgr, Date hireDate, int sal, int comm, int deptNo) {
	        super();
	        this.eNo = empNo;
	        this.eName = empName;
	        this.job = job;
	        this.manager = mgr;
	        this.hireDate = hireDate;
	        this.salary = sal;
	        this.commission = comm;
	        this.dNo = deptNo;
	    }
	     
	    public Employee(int empNo, String empName, String job, int mgr, int sal, int comm, int deptNo) {
	        super();
	        this.eNo = empNo;
	        this.eName = empName;
	        this.job = job;
	        this.manager = mgr;
	        this.salary = sal;
	        this.commission = comm;
	        this.dNo = deptNo;
	    }
	    public Employee(int empNo, String job, int sal, int comm) {
	        super();
	        this.eNo = empNo;
	        this.job = job;
	        this.salary = sal;
	        this.commission = comm;
	    }


	    public int getEmpNo() {
	        return eNo;
	    }
	 
	    public void setEmpNo(int empNo) {
	        this.eNo = empNo;
	    }
	 
	    public String getEmpName() {
	        return eName;
	    }
	 
	    public void setEmpName(String empName) {
	        this.eName = empName;
	    }
	 
	    public String getJob() {
	        return job;
	    }
	 
	    public void setJob(String job) {
	        this.job = job;
	    }
	 
	    public int getMgr() {
	        return manager;
	    }
	 
	    public void setMgr(int mgr) {
	        this.manager = mgr;
	    }
	 
	    public Date getHireDate() {
	        return hireDate;
	    }
	 
	    public void setHireDate(Date hireDate) {
	        this.hireDate = hireDate;
	    }
	 
	    public int getSal() {
	        return salary;
	    }
	 
	    public void setSal(int sal) {
	        this.salary = sal;
	    }
	 
	    public int getComm() {
	        return commission;
	    }
	 
	    public void setComm(int comm) {
	        this.commission = comm;
	    }
	 
	    public int getDeptNo() {
	        return dNo;
	    }
	 
	    public void setDeptNo(int deptNo) {
	        this.dNo = deptNo;
	    }
	     
	     
	     
	     
}

