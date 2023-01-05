package edu.sdr.design_patterns.behavioral.memento;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    private List<edu.sdr.design_patterns.behavioral.memento.Shape> children = new ArrayList<>();

    public CompoundShape(edu.sdr.design_patterns.behavioral.memento.Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(edu.sdr.design_patterns.behavioral.memento.Shape component) {
        children.add(component);
    }

    public void add(edu.sdr.design_patterns.behavioral.memento.Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(edu.sdr.design_patterns.behavioral.memento.Shape child) {
        children.remove(child);
    }

    public void remove(edu.sdr.design_patterns.behavioral.memento.Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
        if (children.size() == 0) {
            return 0;
        }
        int x = children.get(0).getX();
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (children.size() == 0) {
            return 0;
        }
        int y = children.get(0).getY();
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void drag() {
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            child.drag();
        }
    }

    @Override
    public void drop() {
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            child.drop();
        }
    }

    @Override
    public void moveTo(int x, int y) {
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            child.moveTo(x, y);
        }
    }

    @Override
    public void moveBy(int x, int y) {
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            child.moveBy(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            child.setColor(color);
        }
    }

    @Override
    public void unSelect() {
        super.unSelect();
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            child.unSelect();
        }
    }

    public edu.sdr.design_patterns.behavioral.memento.Shape getChildAt(int x, int y) {
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                return child;
            }
        }
        return null;
    }

    public boolean selectChildAt(int x, int y) {
        edu.sdr.design_patterns.behavioral.memento.Shape child = getChildAt(x,y);
        if (child != null) {
            child.select();
            return true;
        }
        return false;
    }

    public List<edu.sdr.design_patterns.behavioral.memento.Shape> getSelected() {
        List<edu.sdr.design_patterns.behavioral.memento.Shape> selected = new ArrayList<>();
        for (edu.sdr.design_patterns.behavioral.memento.Shape child : children) {
            if (child.isSelected()) {
                selected.add(child);
            }
        }
        return selected;
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (Shape child : children) {
            child.paint(graphics);
        }
    }
}