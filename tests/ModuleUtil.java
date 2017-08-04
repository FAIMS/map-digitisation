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
        Ref:  Feature
     */
    public static View get_Feature(Solo solo) {
        String ref = "Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Shape
     */
    public static View get_Shape(Solo solo) {
        String ref = "Shape";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  User_List
     */
    public static View get_UserList(Solo solo) {
        String ref = "User_List";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/IDs
     */
    public static View get_Control_IDs(Solo solo) {
        String ref = "Control/IDs";
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
        Ref:  Control/Vars
     */
    public static View get_Control_Vars(Solo solo) {
        String ref = "Control/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Feature/GControl
     */
    public static View get_Feature_GControl(Solo solo) {
        String ref = "Feature/GControl";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Feature/Main
     */
    public static View get_Feature_Main(Solo solo) {
        String ref = "Feature/Main";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Shape/Shape_Note
     */
    public static View get_Shape_ShapeNote(Solo solo) {
        String ref = "Shape/Shape_Note";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User_List/Manual
     */
    public static View get_UserList_Manual(Solo solo) {
        String ref = "User_List/Manual";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User_List/User_List
     */
    public static View get_UserList_UserList(Solo solo) {
        String ref = "User_List/User_List";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/IDs/Create_Feature
     */
    public static View get_Control_IDs_CreateFeature(Solo solo) {
        String ref = "Control/IDs/Create_Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Map/Assign_Colour
     */
    public static View get_Control_Map_AssignColour(Solo solo) {
        String ref = "Control/Map/Assign_Colour";
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
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Vars/Create_Shape
     */
    public static View get_Control_Vars_CreateShape(Solo solo) {
        String ref = "Control/Vars/Create_Shape";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/GControl/Picture_Button_1
     */
    public static View get_Feature_GControl_PictureButton1(Solo solo) {
        String ref = "Feature/GControl/Picture_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/Main/Find_This_in_The_Map
     */
    public static View get_Feature_Main_FindThisinTheMap(Solo solo) {
        String ref = "Feature/Main/Find_This_in_The_Map";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Feature/Main/Take_From_GPS_1
     */
    public static View get_Feature_Main_TakeFromGPS1(Solo solo) {
        String ref = "Feature/Main/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Feature/GControl/Picture
     */
    public static View get_Feature_GControl_Picture(Solo solo) {
        String ref = "Feature/GControl/Picture";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Map/Colour_to_Assign
     */
    public static View get_Control_Map_ColourtoAssign(Solo solo) {
        String ref = "Control/Map/Colour_to_Assign";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Map/GC_Value
     */
    public static View get_Control_Map_GCValue(Solo solo) {
        String ref = "Control/Map/GC_Value";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Search/Entity_Types
     */
    public static View get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Feature/GControl/Classification
     */
    public static View get_Feature_GControl_Classification(Solo solo) {
        String ref = "Feature/GControl/Classification";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Feature/GControl/GC
     */
    public static View get_Feature_GControl_GC(Solo solo) {
        String ref = "Feature/GControl/GC";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Feature/Main/Feature_Type
     */
    public static View get_Feature_Main_FeatureType(Solo solo) {
        String ref = "Feature/Main/Feature_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Feature/Main/Source
     */
    public static View get_Feature_Main_Source(Solo solo) {
        String ref = "Feature/Main/Source";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/IDs/Next_Line_ID
     */
    public static EditText get_Control_IDs_NextLineID(Solo solo) {
        String ref = "Control/IDs/Next_Line_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/IDs/Next_Point_ID
     */
    public static EditText get_Control_IDs_NextPointID(Solo solo) {
        String ref = "Control/IDs/Next_Point_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/IDs/Next_Polygon_ID
     */
    public static EditText get_Control_IDs_NextPolygonID(Solo solo) {
        String ref = "Control/IDs/Next_Polygon_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/GControl/Date_Completed
     */
    public static EditText get_Feature_GControl_DateCompleted(Solo solo) {
        String ref = "Feature/GControl/Date_Completed";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/GControl/Description
     */
    public static EditText get_Feature_GControl_Description(Solo solo) {
        String ref = "Feature/GControl/Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/GControl/Other_Description
     */
    public static EditText get_Feature_GControl_OtherDescription(Solo solo) {
        String ref = "Feature/GControl/Other_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Main/Accuracy
     */
    public static View get_Feature_Main_Accuracy(Solo solo) {
        String ref = "Feature/Main/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Main/Easting
     */
    public static View get_Feature_Main_Easting(Solo solo) {
        String ref = "Feature/Main/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Main/ID
     */
    public static EditText get_Feature_Main_ID(Solo solo) {
        String ref = "Feature/Main/ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Main/Latitude
     */
    public static View get_Feature_Main_Latitude(Solo solo) {
        String ref = "Feature/Main/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Main/Longitude
     */
    public static View get_Feature_Main_Longitude(Solo solo) {
        String ref = "Feature/Main/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Main/Northing
     */
    public static View get_Feature_Main_Northing(Solo solo) {
        String ref = "Feature/Main/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Feature/Main/Note
     */
    public static EditText get_Feature_Main_Note(Solo solo) {
        String ref = "Feature/Main/Note";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Shape/Shape_Note/Label
     */
    public static EditText get_Shape_ShapeNote_Label(Solo solo) {
        String ref = "Shape/Shape_Note/Label";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Shape/Shape_Note/Line_ID
     */
    public static View get_Shape_ShapeNote_LineID(Solo solo) {
        String ref = "Shape/Shape_Note/Line_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Shape/Shape_Note/Note
     */
    public static EditText get_Shape_ShapeNote_Note(Solo solo) {
        String ref = "Shape/Shape_Note/Note";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Shape/Shape_Note/Point_ID
     */
    public static View get_Shape_ShapeNote_PointID(Solo solo) {
        String ref = "Shape/Shape_Note/Point_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Shape/Shape_Note/Polygon_ID
     */
    public static View get_Shape_ShapeNote_PolygonID(Solo solo) {
        String ref = "Shape/Shape_Note/Polygon_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  User_List/User_List/User_List
     */
    public static View get_UserList_UserList_UserList(Solo solo) {
        String ref = "User_List/User_List/User_List";
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

    /*
        Type: webview
        Ref:  User_List/Manual/Manual
     */
    public static View get_UserList_Manual_Manual(Solo solo) {
        String ref = "User_List/Manual/Manual";
        return (android.view.View) solo.getView((Object) ref);
    }
}
