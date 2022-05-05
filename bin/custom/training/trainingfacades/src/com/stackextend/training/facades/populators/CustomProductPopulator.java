/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.stackextend.training.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * Populates {@link ProductData} with genders
 */
public class CustomProductPopulator extends ProductBasicPopulator<ProductModel, ProductData> {
    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {
        super.populate(productModel, productData);
        productData.setIsTop5(productModel.getIsTop5());
    }
}
