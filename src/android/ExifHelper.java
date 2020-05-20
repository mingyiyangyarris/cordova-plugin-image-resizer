package info.protonet.imageresizer;

import android.media.ExifInterface;
import android.util.Log;

import java.io.IOException;

/**
 * Created by gota on 2/04/18.
 */

public class ExifHelper {
    private static final String LOG_TAG = "Watermarking-ExifHelper";

    @Override
    public String toString() {
        return "ExifHelper{" +
                "aperture='" + aperture + '\'' +
                ", datetime='" + datetime + '\'' +
                ", exposureTime='" + exposureTime + '\'' +
                ", flash='" + flash + '\'' +
                ", focalLength='" + focalLength + '\'' +
                ", gpsAltitude='" + gpsAltitude + '\'' +
                ", gpsAltitudeRef='" + gpsAltitudeRef + '\'' +
                ", gpsDateStamp='" + gpsDateStamp + '\'' +
                ", gpsLatitude='" + gpsLatitude + '\'' +
                ", gpsLatitudeRef='" + gpsLatitudeRef + '\'' +
                ", gpsLongitude='" + gpsLongitude + '\'' +
                ", gpsLongitudeRef='" + gpsLongitudeRef + '\'' +
                ", gpsProcessingMethod='" + gpsProcessingMethod + '\'' +
                ", gpsTimestamp='" + gpsTimestamp + '\'' +
                ", iso='" + iso + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", orientation='" + orientation + '\'' +
                ", whiteBalance='" + whiteBalance + '\'' +
                ", inFile=" + inFile +
                ", outFile=" + outFile +
                '}';
    }

    private String aperture = null;
    private String datetime = null;
    private String exposureTime = null;
    private String flash = null;
    private String focalLength = null;
    private String gpsAltitude = null;
    private String gpsAltitudeRef = null;
    private String gpsDateStamp = null;
    String gpsLatitude = null;
    String gpsLatitudeRef = null;
    String gpsLongitude = null;
    String gpsLongitudeRef = null;
    private String gpsProcessingMethod = null;
    private String gpsTimestamp = null;
    private String iso = null;
    private String make = null;
    private String model = null;
    private String orientation = null;
    private String whiteBalance = null;
    private String imageDescription = null;


    private ExifInterface inFile = null;
    private ExifInterface outFile = null;

    /**
     * The file before it is compressed
     *
     * @param filePath
     * @throws IOException
     */
    public void createInFile(String filePath) throws IOException {
        this.inFile = new ExifInterface(filePath);
    }

    /**
     * The file after it has been compressed
     *
     * @param filePath
     * @throws IOException
     */
    public void createOutFile(String filePath) throws IOException {
        this.outFile = new ExifInterface(filePath);
    }

    /**
     * Reads all the EXIF data from the input file.
     */
    public void readExifData() {
        this.aperture = inFile.getAttribute(ExifInterface.TAG_APERTURE);
        this.datetime = inFile.getAttribute(ExifInterface.TAG_DATETIME);
        this.exposureTime = inFile.getAttribute(ExifInterface.TAG_EXPOSURE_TIME);
        this.flash = inFile.getAttribute(ExifInterface.TAG_FLASH);
        this.focalLength = inFile.getAttribute(ExifInterface.TAG_FOCAL_LENGTH);
        this.gpsAltitude = inFile.getAttribute(ExifInterface.TAG_GPS_ALTITUDE);
        this.gpsAltitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_ALTITUDE_REF);
        this.gpsDateStamp = inFile.getAttribute(ExifInterface.TAG_GPS_DATESTAMP);
        this.gpsLatitude = inFile.getAttribute(ExifInterface.TAG_GPS_LATITUDE);
        this.gpsLatitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_LATITUDE_REF);
        this.gpsLongitude = inFile.getAttribute(ExifInterface.TAG_GPS_LONGITUDE);
        this.gpsLongitudeRef = inFile.getAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF);
        this.gpsProcessingMethod = inFile.getAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD);
        this.gpsTimestamp = inFile.getAttribute(ExifInterface.TAG_GPS_TIMESTAMP);
        this.iso = inFile.getAttribute(ExifInterface.TAG_ISO);
        this.make = inFile.getAttribute(ExifInterface.TAG_MAKE);
        this.model = inFile.getAttribute(ExifInterface.TAG_MODEL);
        this.orientation = inFile.getAttribute(ExifInterface.TAG_ORIENTATION);
        this.whiteBalance = inFile.getAttribute(ExifInterface.TAG_WHITE_BALANCE);
        this.imageDescription = inFile.getAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION);
    }


    /**
     * Writes the previously stored EXIF data to the output file.
     *
     * @throws IOException
     */
    public void writeExifData() throws IOException {
        Log.d(LOG_TAG, "writeExifData this.outFile: " + this.outFile);
        // Don't try to write to a null file
        if (this.outFile == null) {
            return;
        }

        if (this.aperture != null) {
            this.outFile.setAttribute(ExifInterface.TAG_APERTURE, this.aperture);
        }
        if (this.datetime != null) {
            this.outFile.setAttribute(ExifInterface.TAG_DATETIME, this.datetime);
        }
        if (this.exposureTime != null) {
            this.outFile.setAttribute(ExifInterface.TAG_EXPOSURE_TIME, this.exposureTime);
        }
        if (this.flash != null) {
            this.outFile.setAttribute(ExifInterface.TAG_FLASH, this.flash);
        }
        if (this.focalLength != null) {
            this.outFile.setAttribute(ExifInterface.TAG_FOCAL_LENGTH, this.focalLength);
        }
        if (this.gpsAltitude != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_ALTITUDE, this.gpsAltitude);
        }
        if (this.gpsAltitudeRef != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_ALTITUDE_REF, this.gpsAltitudeRef);
        }
        if (this.gpsDateStamp != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_DATESTAMP, this.gpsDateStamp);
        }
        if (this.gpsLatitude != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LATITUDE, this.gpsLatitude);
        }
        if (this.gpsLatitudeRef != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF, this.gpsLatitudeRef);
        }
        if (this.gpsLongitude != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LONGITUDE, this.gpsLongitude);
        }
        if (this.gpsLongitudeRef != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF, this.gpsLongitudeRef);
        }
        if (this.gpsProcessingMethod != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD, this.gpsProcessingMethod);
        }
        if (this.gpsTimestamp != null) {
            this.outFile.setAttribute(ExifInterface.TAG_GPS_TIMESTAMP, this.gpsTimestamp);
        }
        if (this.iso != null) {
            this.outFile.setAttribute(ExifInterface.TAG_ISO, this.iso);
        }
        if (this.make != null) {
            this.outFile.setAttribute(ExifInterface.TAG_MAKE, this.make);
        }
        if (this.model != null) {
            this.outFile.setAttribute(ExifInterface.TAG_MODEL, this.model);
        }
        if (this.orientation != null) {
            this.outFile.setAttribute(ExifInterface.TAG_ORIENTATION, this.orientation);
        }
        if (this.whiteBalance != null) {
            this.outFile.setAttribute(ExifInterface.TAG_WHITE_BALANCE, this.whiteBalance);
        }
        if (this.imageDescription != null) {
            this.outFile.setAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION, this.imageDescription);
        }

        Log.d(LOG_TAG, "writeExifData this: " + this);

        this.outFile.saveAttributes();

        Log.d(LOG_TAG, "saveAttributes finished");
    }

    public int getOrientation() {
        int o = Integer.parseInt(this.orientation);

        if (o == ExifInterface.ORIENTATION_NORMAL) {
            return 0;
        } else if (o == ExifInterface.ORIENTATION_ROTATE_90) {
            return 90;
        } else if (o == ExifInterface.ORIENTATION_ROTATE_180) {
            return 180;
        } else if (o == ExifInterface.ORIENTATION_ROTATE_270) {
            return 270;
        } else {
            return 0;
        }
    }

    public void resetOrientation() {
        this.orientation = "" + ExifInterface.ORIENTATION_NORMAL;
    }
}
