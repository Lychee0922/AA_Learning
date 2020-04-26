package procedure_oriented_example;

public class Example {

    public static void main(String[] args) {

        // step 1 to 3 is a procedure
        // step 1
        action1();
        // step 2
        action2();
        // step 3
        action3();

        // roll dice game
        // step 1
        initialize();
        // step 2
        loopGame();
        // step 3
        showResult();

    }
    private static void initialize(){

    }

    private static void loopGame(){

    }

    private static void showResult(){

    }
    private static void action1(){
        System.out.println("打开冰箱门");
    }
    private static void action2(){
        System.out.println("把大象放进去");
    }
    private static void action3(){
        System.out.println("把冰箱门关上");
    }
}

// 1.初始化
// 2.循环开始：
//      检查轮到谁了
//          轮到谁，谁摇骰子
//      摇到加和为30，停止，否则继续
//   循环结束
// 3.显示结果
// check if the total of player who is 30
// true roll dice
// false -1