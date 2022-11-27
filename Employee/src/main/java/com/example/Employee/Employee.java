package com.example.Employee;

public class Employee {
        private Long id;
        private String name;
        private String mobileNo;
        public Employee(){}
        public Employee(Long id,String name,String mobileNo){
            this.id=id;
            this.name=name;
            this.mobileNo=mobileNo;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id){
            this.id=id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name){
            this.name= name;
        }
        public String getmobileNo() {
            return mobileNo;
        }
        public void setMobileno(String mobileNo){
            this.mobileNo=mobileNo;
        }



    }


