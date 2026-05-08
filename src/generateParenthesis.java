class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        solve(ans, "", n, n);

        return ans;
    }

    public void solve(List<String> ans,
                      String str,
                      int open,
                      int close) {

        if (open == 0 && close == 0) {
            ans.add(str);
            return;
        }

        if (open > 0) {
            solve(ans,
                    str + "(",
                    open - 1,
                    close);
        }

        if (close > open) {
            solve(ans,
                    str + ")",
                    open,
                    close - 1);
        }
    }
}