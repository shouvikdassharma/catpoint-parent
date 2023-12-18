module com.udacity.catpoint.security {
    requires java.desktop;
    requires miglayout;
    requires com.udacity.catpoint.image.service;
    requires com.google.common;
    requires com.google.gson;
    requires java.prefs;
    opens com.udacity.catpoint.security.data to com.google.gson;
}