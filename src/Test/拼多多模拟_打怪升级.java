package Test;

import java.util.HashMap;
import java.util.Scanner;

public class 拼多多模拟_打怪升级 {




        public static HashMap<String, Integer> map = new HashMap<>(); //用于记忆化搜索

        /**
         * @param hp 当前hp
         * @param normalAttack 普通攻击
         * @param buffedAttack 辅助攻击
         * @param isBuffed 本回合是否使用辅助攻击
         * @param cur 当前回合数
         * <a href="/profile/547241" data-card-uid="547241" class="js-nc-card" target="_blank">@return
         */
        public static int process(int hp, int normalAttack, int buffedAttack, int isBuffed, int cur) {
            String str = isBuffed + "_" + hp; //用isBuffed和hp作为记忆化搜索的key

            //每次进入递归之前先搜索是否有缓存结果
            if (map.containsKey(str)) {
                return map.get(str);
            }
            //如果hp < 1,返回需要的回合
            if (hp < 1) {
                map.put(str, cur); //返回结果前加缓存
                return cur;
            }

            int res = 0;
            if (isBuffed == 1) {
                //如果上回合用buffedAttack，则这回合直接减去敌人生命值
                res = process(hp - buffedAttack, normalAttack, buffedAttack, 0, cur + 1);
            } else {
                //如果上回合使用normalAttack，则这回合有两种决策方式
                res = Math.min(process(hp - normalAttack, normalAttack, buffedAttack, 0, cur + 1),
                        process(hp, normalAttack, buffedAttack, 1, cur + 1));
            }
            map.put(str, res); //返回结果前加缓存
            return res;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int hp = sc.nextInt();
            int normal = sc.nextInt();
            int buffed = sc.nextInt();
            //一开始有两种选择
            int a = process(hp, normal, buffed, 1, 1); //蓄力
            int b = process(hp - normal, normal, buffed, 0, 1); //普通攻击
            System.out.println(Math.min(a, b));
        }
    }

