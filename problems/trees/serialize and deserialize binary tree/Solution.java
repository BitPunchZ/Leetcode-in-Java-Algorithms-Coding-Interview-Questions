import java.util.*;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "X#";
        String s = root.val + "#";
        s += serialize(root.left);
        s += serialize(root.right);
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> nodes = new ArrayList<>(Arrays.asList(data.split("#")));
        return helper(nodes);
    }
    
    private TreeNode helper(List<String> nodes) {
        if(nodes.get(0).equals("X")) {
            nodes.remove(0);
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(nodes.get(0)));
        nodes.remove(0);
        node.left = helper(nodes);
        node.right = helper(nodes);
        return node;
    }
}
