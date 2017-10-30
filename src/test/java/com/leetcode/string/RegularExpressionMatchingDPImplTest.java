package com.leetcode.string;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Richard on 17/10/30.
 */
public class RegularExpressionMatchingDPImplTest {

    @Test
    public void testRegularExpressionMatching_aa_a() {
        boolean result = new RegularExpressionMatchingDPImpl().isMatch("aa", "a");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testRegularExpressionMatching_aa_aa() {
        boolean result = new RegularExpressionMatchingDPImpl().isMatch("aa", "aa");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testRegularExpressionMatching_aaa_aa() {
        boolean result = new RegularExpressionMatchingDPImpl().isMatch("aaa", "aa");
        Assert.assertEquals(false, result);
    }

    @Test
    public void testRegularExpressionMatching_aa_astar() {
        boolean result = new RegularExpressionMatchingDPImpl().isMatch("aa", "a*");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testRegularExpressionMatching_aa_dotstar() {
        boolean result = new RegularExpressionMatchingDPImpl().isMatch("aa", ".*");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testRegularExpressionMatching_ab_dotstar() {
        boolean result = new RegularExpressionMatchingDPImpl().isMatch("ab", ".*");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testRegularExpressionMatching_aab_cstarastarbstar() {
        boolean result = new RegularExpressionMatchingDPImpl().isMatch("cab", "c*a*b*");
        Assert.assertEquals(true, result);
    }
}
