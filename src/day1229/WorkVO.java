package day1229;

public class WorkVO {
	private String name;
	private int java;
	private int oracle;
	
	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s
	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s	//¾ËÆ® ½´ÇÁÆ® s
	public WorkVO() {
		
	}

	public WorkVO(String name, int java, int oracle) {
		super();
		this.name = name;
		this.java = java;
		this.oracle = oracle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	@Override
	public String toString() {
		return "WorkVO [name=" + name + ", java=" + java + ", oracle=" + oracle + "]";
	}
	
	
	
	
	
}
