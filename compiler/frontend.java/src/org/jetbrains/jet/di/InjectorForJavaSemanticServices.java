/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.di;

import org.jetbrains.jet.lang.resolve.java.JavaDescriptorResolver;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.resolve.java.JavaBridgeConfiguration;
import org.jetbrains.jet.lang.resolve.java.JavaDependencyByQualifiedNameResolver;
import org.jetbrains.jet.lang.resolve.java.PsiClassFinderImpl;
import org.jetbrains.jet.lang.descriptors.ModuleDescriptor;
import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.java.JavaClassResolutionFacade;
import org.jetbrains.jet.lang.resolve.lazy.storage.StorageManager;
import org.jetbrains.jet.lang.descriptors.SubModuleDescriptor;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaCompileTimeConstResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassObjectResolver;
import org.jetbrains.jet.lang.resolve.java.provider.PsiDeclarationProviderFactory;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaSupertypeResolver;
import org.jetbrains.jet.lang.resolve.java.JavaTypeTransformer;
import org.jetbrains.jet.lang.resolve.java.JavaPackageFragmentProvider;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaSignatureResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaConstructorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaValueParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaFunctionResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaInnerClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaPropertyResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.generators.injectors.GenerateInjectors. DO NOT EDIT! */
public class InjectorForJavaSemanticServices {
    
    private JavaDescriptorResolver javaDescriptorResolver;
    private BindingTrace bindingTrace;
    private JavaBridgeConfiguration javaBridgeConfiguration;
    private JavaDependencyByQualifiedNameResolver javaDependencyByQualifiedNameResolver;
    private PsiClassFinderImpl psiClassFinder;
    private ModuleDescriptor moduleDescriptor;
    private final Project project;
    private final JavaClassResolutionFacade javaClassResolutionFacade;
    private final StorageManager storageManager;
    private final SubModuleDescriptor subModuleDescriptor;
    private final GlobalSearchScope globalSearchScope;
    private JavaClassResolver javaClassResolver;
    private JavaAnnotationResolver javaAnnotationResolver;
    private JavaCompileTimeConstResolver javaCompileTimeConstResolver;
    private JavaClassObjectResolver javaClassObjectResolver;
    private PsiDeclarationProviderFactory psiDeclarationProviderFactory;
    private JavaSupertypeResolver javaSupertypeResolver;
    private JavaTypeTransformer javaTypeTransformer;
    private JavaPackageFragmentProvider javaPackageFragmentProvider;
    private JavaSignatureResolver javaSignatureResolver;
    private JavaConstructorResolver javaConstructorResolver;
    private JavaValueParameterResolver javaValueParameterResolver;
    private JavaFunctionResolver javaFunctionResolver;
    private JavaInnerClassResolver javaInnerClassResolver;
    private JavaPropertyResolver javaPropertyResolver;
    
    public InjectorForJavaSemanticServices(
        @NotNull Project project,
        @NotNull JavaClassResolutionFacade javaClassResolutionFacade,
        @NotNull StorageManager storageManager,
        @NotNull SubModuleDescriptor subModuleDescriptor,
        @NotNull GlobalSearchScope globalSearchScope
    ) {
        this.javaDescriptorResolver = new JavaDescriptorResolver();
        this.bindingTrace = new org.jetbrains.jet.lang.resolve.BindingTraceContext();
        this.javaBridgeConfiguration = new JavaBridgeConfiguration();
        this.project = project;
        this.globalSearchScope = globalSearchScope;
        this.psiClassFinder = new PsiClassFinderImpl(getProject(), globalSearchScope);
        this.javaClassResolutionFacade = javaClassResolutionFacade;
        this.javaDependencyByQualifiedNameResolver = new JavaDependencyByQualifiedNameResolver(getPsiClassFinder(), javaClassResolutionFacade);
        this.moduleDescriptor = new org.jetbrains.jet.lang.descriptors.impl.MutableModuleDescriptor(org.jetbrains.jet.lang.resolve.name.Name.special("<dummy>"), org.jetbrains.jet.lang.resolve.java.JavaToKotlinClassMap.getInstance());
        this.storageManager = storageManager;
        this.subModuleDescriptor = subModuleDescriptor;
        this.javaClassResolver = new JavaClassResolver();
        this.javaAnnotationResolver = new JavaAnnotationResolver();
        this.javaCompileTimeConstResolver = new JavaCompileTimeConstResolver();
        this.javaClassObjectResolver = new JavaClassObjectResolver();
        this.psiDeclarationProviderFactory = new PsiDeclarationProviderFactory(getPsiClassFinder());
        this.javaSupertypeResolver = new JavaSupertypeResolver();
        this.javaTypeTransformer = new JavaTypeTransformer();
        this.javaPackageFragmentProvider = new JavaPackageFragmentProvider(getBindingTrace(), storageManager, psiDeclarationProviderFactory, getJavaDescriptorResolver(), getPsiClassFinder(), subModuleDescriptor);
        this.javaSignatureResolver = new JavaSignatureResolver();
        this.javaConstructorResolver = new JavaConstructorResolver();
        this.javaValueParameterResolver = new JavaValueParameterResolver();
        this.javaFunctionResolver = new JavaFunctionResolver();
        this.javaInnerClassResolver = new JavaInnerClassResolver();
        this.javaPropertyResolver = new JavaPropertyResolver();

        this.javaDescriptorResolver.setClassResolutionFacade(javaClassResolutionFacade);
        this.javaDescriptorResolver.setClassResolver(javaClassResolver);
        this.javaDescriptorResolver.setConstructorResolver(javaConstructorResolver);
        this.javaDescriptorResolver.setFunctionResolver(javaFunctionResolver);
        this.javaDescriptorResolver.setInnerClassResolver(javaInnerClassResolver);
        this.javaDescriptorResolver.setPropertiesResolver(javaPropertyResolver);

        javaClassResolver.setAnnotationResolver(javaAnnotationResolver);
        javaClassResolver.setClassObjectResolver(javaClassObjectResolver);
        javaClassResolver.setClassResolutionFacade(javaClassResolutionFacade);
        javaClassResolver.setJavaDescriptorResolver(javaDescriptorResolver);
        javaClassResolver.setPackageFragmentProvider(javaPackageFragmentProvider);
        javaClassResolver.setPsiDeclarationProviderFactory(psiDeclarationProviderFactory);
        javaClassResolver.setSignatureResolver(javaSignatureResolver);
        javaClassResolver.setSupertypesResolver(javaSupertypeResolver);
        javaClassResolver.setTrace(bindingTrace);

        javaAnnotationResolver.setClassResolver(javaClassResolver);
        javaAnnotationResolver.setCompileTimeConstResolver(javaCompileTimeConstResolver);

        javaCompileTimeConstResolver.setAnnotationResolver(javaAnnotationResolver);
        javaCompileTimeConstResolver.setClassResolver(javaClassResolver);

        javaClassObjectResolver.setJavaDescriptorResolver(javaDescriptorResolver);
        javaClassObjectResolver.setPsiDeclarationProviderFactory(psiDeclarationProviderFactory);
        javaClassObjectResolver.setSupertypesResolver(javaSupertypeResolver);
        javaClassObjectResolver.setTrace(bindingTrace);

        javaSupertypeResolver.setClassResolver(javaClassResolver);
        javaSupertypeResolver.setProject(project);
        javaSupertypeResolver.setSemanticServices(javaClassResolutionFacade);
        javaSupertypeResolver.setTrace(bindingTrace);
        javaSupertypeResolver.setTypeTransformer(javaTypeTransformer);

        javaTypeTransformer.setClassResolutionFacade(javaClassResolutionFacade);
        javaTypeTransformer.setProject(project);

        javaSignatureResolver.setJavaSemanticServices(javaDependencyByQualifiedNameResolver);
        javaSignatureResolver.setTypeTransformer(javaTypeTransformer);

        javaConstructorResolver.setTrace(bindingTrace);
        javaConstructorResolver.setTypeTransformer(javaTypeTransformer);
        javaConstructorResolver.setValueParameterResolver(javaValueParameterResolver);

        javaValueParameterResolver.setTypeTransformer(javaTypeTransformer);

        javaFunctionResolver.setAnnotationResolver(javaAnnotationResolver);
        javaFunctionResolver.setParameterResolver(javaValueParameterResolver);
        javaFunctionResolver.setSignatureResolver(javaSignatureResolver);
        javaFunctionResolver.setTrace(bindingTrace);
        javaFunctionResolver.setTypeTransformer(javaTypeTransformer);

        javaInnerClassResolver.setClassResolver(javaClassResolver);

        javaPropertyResolver.setAnnotationResolver(javaAnnotationResolver);
        javaPropertyResolver.setJavaSignatureResolver(javaSignatureResolver);
        javaPropertyResolver.setTrace(bindingTrace);
        javaPropertyResolver.setTypeTransformer(javaTypeTransformer);

        javaBridgeConfiguration.init();

    }
    
    @PreDestroy
    public void destroy() {
    }
    
    public JavaDescriptorResolver getJavaDescriptorResolver() {
        return this.javaDescriptorResolver;
    }
    
    public BindingTrace getBindingTrace() {
        return this.bindingTrace;
    }
    
    public PsiClassFinderImpl getPsiClassFinder() {
        return this.psiClassFinder;
    }
    
    public Project getProject() {
        return this.project;
    }
    
}
