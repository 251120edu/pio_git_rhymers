package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.Node;
import org.junit.Assert;
import org.junit.Test;

public class NodeJUnitTest {

    @Test
    public void testNodeConstructor() {
        int testValue = 5;
        Node node = new Node(testValue);
        Assert.assertEquals(testValue, node.getValue());
        Assert.assertNull(node.getPrev());
        Assert.assertNull(node.getNext());
    }

    @Test
    public void testSetValue() {
        Node node = new Node(0);
        int newValue = 10;
        node.setValue(newValue);
        Assert.assertEquals(newValue, node.getValue());
    }

    @Test
    public void testSetAndGetPrev() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);

        node1.setPrev(node2);
        Assert.assertEquals(node2, node1.getPrev());
    }

    @Test
    public void testSetAndGetNext() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);

        node1.setNext(node2);
        Assert.assertEquals(node2, node1.getNext());
    }
}
