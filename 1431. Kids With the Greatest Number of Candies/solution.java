class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> returnList = new ArrayList<Boolean>();
        int maxCandies = 0;

        for (int nCandies : candies) {
            if (nCandies > maxCandies) {
                maxCandies = nCandies;
            }
        }

        for (int nCandies : candies) {

            if (nCandies + extraCandies >= maxCandies) {
                returnList.add(true);

            } else {
                returnList.add(false);
            }
        }
        return returnList;
    }
}