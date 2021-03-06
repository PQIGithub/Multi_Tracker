package net.openid.appauth.network;

import android.content.Context;
import android.content.SharedPreferences;


public class SharedPreferencesUtil {

    public static SharedPreferences getDefaultSharedPreference(Context context){
        return context. getSharedPreferences(
                Constants.PREFERENCE_NAME, Context.MODE_PRIVATE);
    }
    public static void setAuthToken(Context context, String token) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("token", token);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String getAuthToken(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("token", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    public static void setRefreshToken(Context context, String RefreshToken) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("RefreshToken", RefreshToken);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String getRefreshToken(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("RefreshToken", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void setCodeVerifier(Context context, String CodeVerifier) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("CodeVerifier", CodeVerifier);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String getCodeVerifier(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("CodeVerifier", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public static void setAsanaEmail(Context context, String asana_email) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("asana_email", asana_email);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setUserId(Context context, String id) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("user_id",id);
            //SharedPreferences.Editor editor = preferences.edit();
            editor.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getUserId(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("user_id", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void setPassword(Context context, String password) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("password", password);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getPassword(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("password", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    public static String getAsanaEmail(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("asana_email", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    public static void setAsanaName(Context context, String asana_name) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("asana_name", asana_name);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String getAsanaName(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("asana_name", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void setLevyLabWorkspaceId(Context context, String workspace_gid) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("levy_lab_workspace_gid", workspace_gid);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getLevyLabWorkspaceId(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("levy_lab_workspace_gid", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void setCurrentLoggedInUserWorkspaceId(Context context, String workspace_gid) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("current_logged_in_user_workspace_gid", workspace_gid);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getCurrentLoggedInUserWorkspaceId(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("current_logged_in_user_workspace_gid", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }



    public static void setCurrentLoggedInUserWorkspaceName(Context context, String workspace_gid) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("current_logged_in_user_workspace_name", workspace_gid);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getCurrentLoggedInUserWorkspaceName(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("current_logged_in_user_workspace_name", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    public static void setTeamIdForCreatingNewProject(Context context, String workspace_gid) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("team_id_for_creating_new_project", workspace_gid);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getTeamIdForCreatingNewProject(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("team_id_for_creating_new_project", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void setTeamNameForCreatingNewProject(Context context, String workspace_gid) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("team_name_for_creating_new_project", workspace_gid);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getTeamNameForCreatingNewProject(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("team_name_for_creating_new_project", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    public static void setUserDetails(Context context, String userDetails) {
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("userDetails", userDetails);
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getUserDetails(Context context) {
        String val = "";
        try {
            SharedPreferences preferences = getDefaultSharedPreference(context);
            val = preferences.getString("userDetails", "");
            return val;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}