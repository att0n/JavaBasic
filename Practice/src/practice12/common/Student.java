/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	public int studentId;

	/** 受講生氏名 */
	public String studentName;

	/** 会社名 */
	public String companyName;

	/** 教室名 */
	public String className;

	/** メールアドレス */
	public String mail;

	/** パスワード */
	public String password;



	/**ID*/
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int id) {
		this.studentId = id;
	}
	/**氏名*/
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	/**会社名*/
	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String name) {
		this.companyName = name;
	}
	/**教室名*/
	public String getClassName() {
		return this.className;
	}
	public void setClassName(String name) {
		this.className = name;
	}
	/**メールアドレス*/
	public String getMail() {
		return this.mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**パスワード*/
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String pass) {
		this.password = pass;
	}
}
