public class xxn {


    public static void main(String[] args) {
        int total = 660;
        double sens = 0.807;
        double spec = 0.925;
        double ppv = 0.919;
        double npv = 0.820;

        for(int i=0;i<=total;i++)
        {
            int pos = i, neg = total-i;
            long tp = Math.round(pos * sens);
            long fn = pos - tp;
            long tn = Math.round(neg*spec);
            long fp = neg - tn;
            double sens1 = tp * 1.0 /(tp+fn);
            double spec1 = tn * 1.0 /(tn+fp);
            double ppv1 = tp * 1.0 /(tp+fp);
            double npv1 = tn * 1.0 /(tn+fn);
            System.out.println("hhh:"+sens1);
            if(Math.abs(sens1-sens)<=0.001&&Math.abs(spec1-spec)<=0.001&&Math.abs(ppv1-ppv)<=0.001&&Math.abs(npv1-npv)<=0.001)
            {
                System.out.println(tp+" "+fp+" "+" "+tn+" "+fn);
            }
        }

    }
}
