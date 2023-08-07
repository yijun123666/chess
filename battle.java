public class battle {
    public static int board[][]=new int[20][20];
    public static void main(String[] args) {
        int me=1;
        int opponent=-1;
        Boolean IFirst=true;
        if(IFirst){
            board[10][10]=1;
        }
        while (true) {
            getOpponentChess();
            int result1[] = maxPossibleWin(opponent); // possible(0-100), position1(X,Y), position2(X,Y)
            int result2[] = maxPossibleWin(me); // possible2, mePposition1, mePosition2
            if (result2[0] > result1[0]) {
                getMyChess(result2);
            } else {
                getMyChess(result1);
            }
        }
    }

    public static void getOpponentChess(){
        int position1[] = new int[2];
        int position2[] = new int[2];
        //http get here

        refreshBoard(-1, position1, position2);
    }

    public static void getMyChess(int result[]){
        //http send here

        refreshBoard(1, new int[]{result[1], result[2]}, new int[]{result[3], result[4]});
    }

    public static void refreshBoard(int who, int position1[], int position2[]){
        board[position1[0]][position1[1]] = who;
        board[position2[0]][position2[1]] = who;
    }

    public static int[] maxPossibleWin(int who){  // 关键函数，可用规则集或者神经网络
        int result[] = new int[5];
        //result = neuralNetwork(who, board);

        //1.找到棋盘中最长的线，2.观察是否可以继续下到6个，3.如果不可以，选下一根线，如果可以，落子，填概率
        //(1.)的算法：先找到棋盘里的自己的一个子，深度优先找自己子的群，每进一个斜积分加5，每进一个直积分加3.发现和上一个扩展节点是相同方向的扩展则积分为上一个节点得分的两倍。
        // 找到棋盘上所有的群，在积分最高的群里选出积分最高的节点，回溯得到最长的线。概率为群的积分。



        return result;
    }
}

