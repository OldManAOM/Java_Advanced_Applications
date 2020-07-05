/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADVJavaProgramming.newpackage;

/**
 *
 * @author Bradd
 */
public class ValidateInput {
    public static boolean validateCard(String userCard)
        {
            return userCard.matches("[1-9]\\d{3}-[1-3][1-3][1-3][1-3]-\\d{4}-\\d{4}");
        }
}
