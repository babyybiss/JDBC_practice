package com.hiMedia.model.dto;

import java.time.LocalDate;

public class EmpDTO {

    private String EMP_ID;
    private String EMP_NAME;
    private String EMP_NO;
    private String EMAIL;
    private String PHONE;
    private String DEPT_CODE;
    private String JOB_CODE;
    private String SAL_LEVEL;
    private int SALARY;
    private Double BONUS;
    private String MANAGER_ID;
    private LocalDate HIRE_DATE;
    private LocalDate ENT_DATE;
    private String ENT_YN;

    public EmpDTO() {
    }

    public EmpDTO(String EMP_ID, String EMP_NAME, String EMP_NO, String EMAIL, String PHONE, String DEPT_CODE, String JOB_CODE, String SAL_LEVEL, int SALARY, Double BONUS, String MANAGER_ID, LocalDate HIRE_DATE, LocalDate ENT_DATE, String ENT_YN) {
        this.EMP_ID = EMP_ID;
        this.EMP_NAME = EMP_NAME;
        this.EMP_NO = EMP_NO;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
        this.DEPT_CODE = DEPT_CODE;
        this.JOB_CODE = JOB_CODE;
        this.SAL_LEVEL = SAL_LEVEL;
        this.SALARY = SALARY;
        this.BONUS = BONUS;
        this.MANAGER_ID = MANAGER_ID;
        this.HIRE_DATE = HIRE_DATE;
        this.ENT_DATE = ENT_DATE;
        this.ENT_YN = ENT_YN;
    }

    public String getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(String EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public String getEMP_NO() {
        return EMP_NO;
    }

    public void setEMP_NO(String EMP_NO) {
        this.EMP_NO = EMP_NO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getDEPT_CODE() {
        return DEPT_CODE;
    }

    public void setDEPT_CODE(String DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }

    public String getJOB_CODE() {
        return JOB_CODE;
    }

    public void setJOB_CODE(String JOB_CODE) {
        this.JOB_CODE = JOB_CODE;
    }

    public String getSAL_LEVEL() {
        return SAL_LEVEL;
    }

    public void setSAL_LEVEL(String SAL_LEVEL) {
        this.SAL_LEVEL = SAL_LEVEL;
    }

    public int getSALARY() {
        return SALARY;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }

    public Double getBONUS() {
        return BONUS;
    }

    public void setBONUS(Double BONUS) {
        this.BONUS = BONUS;
    }

    public String getMANAGER_ID() {
        return MANAGER_ID;
    }

    public void setMANAGER_ID(String MANAGER_ID) {
        this.MANAGER_ID = MANAGER_ID;
    }

    public LocalDate getHIRE_DATE() {
        return HIRE_DATE;
    }

    public void setHIRE_DATE(LocalDate HIRE_DATE) {
        this.HIRE_DATE = HIRE_DATE;
    }

    public LocalDate getENT_DATE() {
        return ENT_DATE;
    }

    public void setENT_DATE(LocalDate ENT_DATE) {
        this.ENT_DATE = ENT_DATE;
    }

    public String getENT_YN() {
        return ENT_YN;
    }

    public void setENT_YN(String ENT_YN) {
        this.ENT_YN = ENT_YN;
    }

    @Override
    public String toString() {
        return "EmpDTO{" +
                "EMP_ID='" + EMP_ID + '\'' +
                ", EMP_NAME='" + EMP_NAME + '\'' +
                ", EMP_NO='" + EMP_NO + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", DEPT_CODE='" + DEPT_CODE + '\'' +
                ", JOB_CODE='" + JOB_CODE + '\'' +
                ", SAL_LEVEL='" + SAL_LEVEL + '\'' +
                ", SALARY=" + SALARY +
                ", BONUS=" + BONUS +
                ", MANAGER_ID='" + MANAGER_ID + '\'' +
                ", HIRE_DATE=" + HIRE_DATE +
                ", ENT_DATE=" + ENT_DATE +
                ", ENT_YN='" + ENT_YN + '\'' +
                '}';
    }
}
