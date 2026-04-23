package LeetCode;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            // Verifica se o complemento já foi visto
            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }

            // Guarda o número atual com seu índice
            mapa.put(nums[i], i);
        }

        return new int[]{}; // nunca vai chegar aqui (sempre tem solução)
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] resultado = twoSum(nums, target);

        System.out.println("[" + resultado[0] + ", " + resultado[1] + "]");
    }
}
