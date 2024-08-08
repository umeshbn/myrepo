package com.Inflow.DelegateDemo.delegate;


@Component
public class MyJavaDelegate implements JavaDelegate {

   public void execute(DelegateExecution delegateExecution) {
       System.out.println("Executing Java delegate...");

       TaskService taskService = ApplicationContextHolder.getContext().getBean(TaskService.class);
       long count = taskService.createTaskQuery().active().count();

       System.out.println(count +"is the count of active task");
       System.out.println("**************");
   }
}

