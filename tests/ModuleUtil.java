package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Simple_Form
     */
    public static View get_SimpleForm(Solo solo) {
        String ref = "Simple_Form";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  User
     */
    public static View get_User(Solo solo) {
        String ref = "User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Map
     */
    public static View get_Control_Map(Solo solo) {
        String ref = "Control/Map";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Simple_Forms
     */
    public static View get_Control_SimpleForms(Solo solo) {
        String ref = "Control/Simple_Forms";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Simple_Form/Simple_Form
     */
    public static View get_SimpleForm_SimpleForm(Solo solo) {
        String ref = "Simple_Form/Simple_Form";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User/User
     */
    public static View get_User_User(Solo solo) {
        String ref = "User/User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Map/Center_Me_1
     */
    public static View get_Control_Map_CenterMe1(Solo solo) {
        String ref = "Control/Map/Center_Me_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Simple_Forms/New_Simple_Form
     */
    public static View get_Control_SimpleForms_NewSimpleForm(Solo solo) {
        String ref = "Control/Simple_Forms/New_Simple_Form";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Simple_Form/Simple_Form/Take_From_GPS_1
     */
    public static View get_SimpleForm_SimpleForm_TakeFromGPS1(Solo solo) {
        String ref = "Simple_Form/Simple_Form/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Simple_Form/Simple_Form/Dropdown
     */
    public static View get_SimpleForm_SimpleForm_Dropdown(Solo solo) {
        String ref = "Simple_Form/Simple_Form/Dropdown";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Simple_Form/Simple_Form/Accuracy
     */
    public static View get_SimpleForm_SimpleForm_Accuracy(Solo solo) {
        String ref = "Simple_Form/Simple_Form/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Simple_Form/Simple_Form/Easting
     */
    public static View get_SimpleForm_SimpleForm_Easting(Solo solo) {
        String ref = "Simple_Form/Simple_Form/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Simple_Form/Simple_Form/ID
     */
    public static EditText get_SimpleForm_SimpleForm_ID(Solo solo) {
        String ref = "Simple_Form/Simple_Form/ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Simple_Form/Simple_Form/Latitude
     */
    public static View get_SimpleForm_SimpleForm_Latitude(Solo solo) {
        String ref = "Simple_Form/Simple_Form/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Simple_Form/Simple_Form/Longitude
     */
    public static View get_SimpleForm_SimpleForm_Longitude(Solo solo) {
        String ref = "Simple_Form/Simple_Form/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Simple_Form/Simple_Form/Name
     */
    public static EditText get_SimpleForm_SimpleForm_Name(Solo solo) {
        String ref = "Simple_Form/Simple_Form/Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Simple_Form/Simple_Form/Northing
     */
    public static View get_SimpleForm_SimpleForm_Northing(Solo solo) {
        String ref = "Simple_Form/Simple_Form/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Simple_Forms/Existing_Simple_Forms
     */
    public static View get_Control_SimpleForms_ExistingSimpleForms(Solo solo) {
        String ref = "Control/Simple_Forms/Existing_Simple_Forms";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  User/User/User_List
     */
    public static View get_User_User_UserList(Solo solo) {
        String ref = "User/User/User_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: map
        Ref:  Control/Map/Map
     */
    public static View get_Control_Map_Map(Solo solo) {
        String ref = "Control/Map/Map";
        return (android.view.View) solo.getView((Object) ref);
    }
}
