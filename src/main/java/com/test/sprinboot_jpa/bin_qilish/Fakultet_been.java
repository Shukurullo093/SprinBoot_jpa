package com.test.sprinboot_jpa.bin_qilish;

import com.test.sprinboot_jpa.Talaba_malumotlari.Fakulteti;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Fakultet_been extends JpaRepository<Fakulteti , Integer> {
   public boolean existsByFakultetNomiAndUnversitetId(String fakultetNomi , Integer id);
}
