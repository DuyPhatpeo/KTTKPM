package behavioral.chain_of_responsibility.f88;

public class ChuTich extends ChoVayF88{
    public ChuTich(String ten, String chucVu, int hanMucChoVay) {
        super(ten, chucVu, hanMucChoVay);
    }

    @Override
    public ChoVayF88 capCaoHon(ChoVayF88 capCao) {
        return null;
    }

    @Override
    public String xuLyVay(int soTienVay) {
        if (soTienVay <= hanMucChoVay){
            StringBuilder builder = new StringBuilder();
            builder.append(chucVu).append(" ").append(ten)
                    .append(" duyệt số tiền vay: ").append(soTienVay).append("vnđ")
                    .append(". Nhớ trả tiền lãi đúng hạn!");
            return builder.toString();
        }
        return "Ra Eximbank vay!!!";
    }
}
