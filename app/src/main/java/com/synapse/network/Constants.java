package com.synapse.network;

/**
 * Created by Jitendra on 22,March,2019
 */

public class Constants {

    public static String BASE_URL_LIVE = "https://app.asana.com";

    public static enum API_TYPE {
        AUTH_CODE("AUTH_CODE"),
        INITIAL_TOKEN("INITIAL_TOKEN"),

        GET_PROJECTS("GET_PROJECTS"),
        GET_PROJECTS_BY_WORKSPACE("GET_PROJECTS_BY_WORKSPACE"),
        SEARCH_TASK_BY_WORKSPACE("SEARCH_TASK_BY_WORKSPACE"),
        SEARCH_PROJECT_BY_WORKSPACE("SEARCH_PROJECT_BY_WORKSPACE"),
        GET_TASKS_BY_PROJECT("GET_TASKS_BY_PROJECT"),
        GET_NEXT_TASKS_BY_PROJECT("GET_NEXT_TASKS_BY_PROJECT"),
        UPDATE_TASK("UPDATE_TASK"),
        CREATE_PROJECT_IN_WORKSPACE("CREATE_PROJECT_IN_WORKSPACE"),
        ADD_TASK_TO_PROJECT("ADD_TASK_TO_PROJECT"),
        UPLOAD_ATTACHMENTS("UPLOAD_ATTACHMENTS"),
        TASK_DETAILS("TASK_DETAILS"),
        FEASYBEACON_TASK_DETAILS("FEASYBEACON_TASK_DETAILS"),
        UPDATE_FEASYBEACON_TASK("UPDATE_FEASYBEACON_TASK"),
        GET_TEAMS("GET_TEAMS"),
        GET_USER_DETAILS("GET_USER_DETAILS"),
        GET_TEAMS_IN_ORGANIZATION("GET_TEAMS_IN_ORGANIZATION"),
        GET_TEAMS_FOR_USER("GET_TEAMS_FOR_USER"),
        REFRESH_TOKEN("REFRESH_TOKEN");

        private String url;

        API_TYPE(String url) {
            this.url = url;
        }

        public String url() {
            return url;
        }
    }

    public static String CLIENT_ID = "1189021352957129";
    public static String CLIENT_SECRET = "cfb17d828cce7f46ddb6891ac9ad07f1";
    public static String REDIRECT_URI = "https://www.pqi.org/app/AppAuth.html";
    public static String PERSONAL_ACCESS_TOKEN = "1/1175663495251439:6151ba2ed10b6d086d4235eb6615e8bc";
}
