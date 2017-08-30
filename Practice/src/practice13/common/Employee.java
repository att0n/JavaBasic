package practice13.common;
/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */
public class Employee extends practice13.common.Person {
	private String departmentNm;
	private int departmentCnt;

	public Employee(int i,String n,String m,String p,String dn,int dc) {
		super.userNm = n;
		super.mail = m;
		super.password = p;
		super.userId = i;
		this.departmentNm = dn;
		this.departmentCnt = dc;
	}

	public String getDepartmentNm() {
		return departmentNm;
	}
	public void setDepartmentNm(String dn) {
		this.departmentNm = dn;
	}
	public int getDepartmentCnt() {
		return departmentCnt;
	}
	public void setDepartmentCnt(int dc) {
		this.departmentCnt = dc;
	}
}
