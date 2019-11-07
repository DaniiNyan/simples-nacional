package com.daniinyan.poc.simplesnacional;

import com.daniinyan.poc.simplesnacional.domain.Attachment;
import com.daniinyan.poc.simplesnacional.domain.AttachmentFive;
import com.daniinyan.poc.simplesnacional.domain.Company;
import com.daniinyan.poc.simplesnacional.service.SimplesNacional;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class App {
    public static void main(String[] args) {
        Attachment attachment1 = new AttachmentFive();
        SimplesNacional simplesNacional = new SimplesNacional();

        Observable<Company> companiesObservable =
                Observable.just(new Company("Company One", attachment1, 185_000D));

        Observer<Company> simplesNacionalObserver = new Observer<Company>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println(d);
            }

            @Override
            public void onNext(Company company) {
                System.out.println(simplesNacional.calculate(company));
            }

            @Override
            public void onError(Throwable e) {
                System.out.println(e);
            }

            @Override
            public void onComplete() {
                System.out.println("done");
            }
        };

        companiesObservable.safeSubscribe(simplesNacionalObserver);
    }
}
