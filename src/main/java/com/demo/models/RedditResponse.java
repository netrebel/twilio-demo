package com.demo.models;

import java.util.List;

/**
 * @author Miguel Reyes
 *         Date: 10/12/15
 *         Time: 11:07 AM
 */
public class RedditResponse {

    public Data data;

    public Data getData() {
        return data;
    }

    public static class Data {

        public List<Children> children;

        public List<Children> getChildren() {
            return children;
        }
    }

    public static class Children {

        public ChildrenData data;

        public ChildrenData getData() {
            return data;
        }
    }

    public static class ChildrenData {
        public String title;
        public String url;

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }
    }
}
