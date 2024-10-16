public class AkunBankOOP {
    public static void main(String[] args) {
        AkunBank akunAndi = new AkunBank("Andi", 1000000);
        AkunBank akunBudi = new AkunBank("Budi", 500000);

        System.out.println("Saldo awal:");
        akunAndi.cekSaldo(); 
        akunBudi.cekSaldo(); 

        akunAndi.setorTunai(500000);
        akunBudi.tarikTunai(200000);
        akunAndi.transfer(akunBudi, 300000); 

        System.out.println("\nSaldo setelah transaksi:");
        akunAndi.cekSaldo(); 
        akunBudi.cekSaldo(); 
    }
}

class AkunBank {
    private String namaNasabah;
    private double saldo;

    public AkunBank(String namaNasabah, double saldoAwal) {
        this.namaNasabah = namaNasabah;
        this.saldo = saldoAwal;
    }

    public void setorTunai(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor tunai berhasil. Saldo " + namaNasabah + " bertambah " + jumlah);
    }

    public void tarikTunai(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik tunai berhasil. Saldo " + namaNasabah + " berkurang " + jumlah);
        } else {
            System.out.println("Saldo " + namaNasabah + " tidak mencukupi.");
        }
    }

    public void cekSaldo() {
        System.out.println("Saldo " + namaNasabah + ": " + saldo);
    }

    public void transfer(AkunBank penerima, double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            penerima.saldo += jumlah;
            System.out.println("Transfer berhasil. " + namaNasabah + " mentransfer " + jumlah + " ke " + penerima.namaNasabah);
        } else {
            System.out.println("Saldo " + namaNasabah + " tidak mencukupi untuk transfer.");
        }
    }

}

