class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> similarAnagram = Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> {
                    char[] chars = s.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        return similarAnagram.values().stream().toList();
    }
}
