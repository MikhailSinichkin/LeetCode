// Вам предоставляется таблица m x n целых чисел accounts где accounts[i][j] - сумма денег, которая есть у i​​​​​​​​​​​th​​​​ клиента в группе j​​​​​​​​​​​th​​​​ b. 
// Return the wэлектронное здравоохранение , которое есть у самого богатого клиента.
// Богатство заказчика это сумма денег, у них на все свои банковские счета.
// Самый богатый клиент-это клиент, который имеет максимальное богатство.

 

// Пример 1:

// Ввод данных: счета = [[1,2,3],[3,2,1]]
// Вывод: 6
// Пояснение:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Оба клиента считаются самыми богатыми, их состояние составляет 6 у каждого, поэтому возвращайте 6.



public class RichestCustomerWealth  {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;

        for(int[] customer : accounts){
            int currentCustomerWealth = 0;

            for (int bank : customer){
                currentCustomerWealth += bank;
                
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth );
            // System.out.println(maxWealthSoFar);
        }
        return maxWealthSoFar;
    }

    public static void main(String[] args) {
        
        RichestCustomerWealth solution = new RichestCustomerWealth();
        int[][] accounts = {{1,2,3},{4,5,6},{7,8,9}};
        int maxWealth = solution.maximumWealth(accounts);
        System.out.println(maxWealth);
    }
}
