package filerecovery.photosrecovery.allrecovery.manager.contact;

import android.net.Uri;
import androidx.annotation.Keep;
import cj.w;
import com.android.lib.libbase.zjuibase.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Keep
/* loaded from: classes2.dex */
public class ContactModel extends a {
    private String contactId;
    private String name;
    private Uri photoURI;
    private List<String> mobileNumbers = new ArrayList();
    private List<String> emails = new ArrayList();

    public void addEmails(String str) {
        this.emails.add(str);
    }

    public void addMobileNumber(String str) {
        this.mobileNumbers.add(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContactModel contactModel = (ContactModel) obj;
        return Objects.equals(this.contactId, contactModel.contactId) && Objects.equals(this.mobileNumbers, contactModel.mobileNumbers) && Objects.equals(this.emails, contactModel.emails) && Objects.equals(this.name, contactModel.name) && Objects.equals(this.photoURI, contactModel.photoURI);
    }

    public String getContactId() {
        return this.contactId;
    }

    public List<String> getEmails() {
        return this.emails;
    }

    public String getFirstMobileNumber() {
        List<String> list = this.mobileNumbers;
        return (list == null || list.size() <= 0) ? "" : this.mobileNumbers.get(0);
    }

    public List<String> getMobileNumbers() {
        return this.mobileNumbers;
    }

    public String getName() {
        return this.name;
    }

    public Uri getPhotoURI() {
        return this.photoURI;
    }

    @Override // com.android.lib.libbase.zjuibase.a
    public int getSelectItemType() {
        return 0;
    }

    public int hashCode() {
        return Objects.hash(this.contactId, this.mobileNumbers, this.emails, this.name, this.photoURI);
    }

    public void setContactId(String str) {
        this.contactId = str;
    }

    public void setEmails(List<String> list) {
        this.emails.clear();
        if (list != null) {
            this.emails.addAll(list);
        }
    }

    public void setMobileNumbers(List<String> list) {
        this.mobileNumbers.clear();
        if (list != null) {
            this.mobileNumbers.addAll(list);
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhotoURI(Uri uri) {
        this.photoURI = uri;
    }

    public String toString() {
        return w.n("Em8ZdChjBU0tZFZsOSx1YzpuRWEgdANkdCc=", "IR5QKK7a") + this.contactId + '\'' + w.n("WSAvby9pImUHdQZiF3JHPQ==", "VIKiphBO") + this.mobileNumbers + w.n("fSASbShpHXM9", "XgBYcS8l") + this.emails + w.n("WSAsYSBlcyc=", "mI8GwxWo") + this.name + '\'' + w.n("fSAHaCZ0HlUQST0=", "3J6LaHRy") + this.photoURI + '}';
    }
}
