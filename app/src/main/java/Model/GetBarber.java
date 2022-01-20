package Model;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class GetBarber implements Parcelable {
    @SerializedName("id_barber")
    @Expose
    private Integer idBarber;
    @SerializedName("nama_barber")
    @Expose
    private String namaBarber;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("gambar")
    @Expose
    private String gambar;

    public Integer getIdBarber() {
        return idBarber;
    }

    public void setIdBarber(Integer idBarber) {
        this.idBarber = idBarber;
    }

    public String getNamaBarber() {
        return namaBarber;
    }

    public void setNamaBarber(String namaBarber) {
        this.namaBarber = namaBarber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.idBarber);
        dest.writeString(this.namaBarber);
        dest.writeString(this.status);
        dest.writeString(this.gambar);
    }

    public void readFromParcel(Parcel source) {
        this.idBarber = (Integer) source.readValue(Integer.class.getClassLoader());
        this.namaBarber = source.readString();
        this.status = source.readString();
        this.gambar = source.readString();
    }

    public GetBarber() {
    }

    protected GetBarber(Parcel in) {
        this.idBarber = (Integer) in.readValue(Integer.class.getClassLoader());
        this.namaBarber = in.readString();
        this.status = in.readString();
        this.gambar = in.readString();
    }

    public static final Parcelable.Creator<GetBarber> CREATOR = new Parcelable.Creator<GetBarber>() {
        @Override
        public GetBarber createFromParcel(Parcel source) {
            return new GetBarber(source);
        }

        @Override
        public GetBarber[] newArray(int size) {
            return new GetBarber[size];
        }
    };
}
