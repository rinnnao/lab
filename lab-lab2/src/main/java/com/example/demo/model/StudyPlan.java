package com.example.demo.model;

public class StudyPlan {
    private int id;
    private int subject_id;
    private int exam_plan_id;


    public StudyPlan(int id, int student_id, int exam_plan_id) {
        this.id = id;
        this.subject_id = subject_id;
        this.exam_plan_id = exam_plan_id;




        public int getId() { return id;}
        public void setId(int id) {
            this.id = id;
        }

        public int getSubject_id() { return student_id;}
        public void setSubject_id (int subject_id) {
            this.subject_id = subject_id;
        }

        public int getExam_plan_id () { return exam_plan_id;}
        public void setExam_plan_id (int exam_plan_id) {
            this.exam_plan_id = exam_plan_id;
        }

    }